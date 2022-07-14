import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import { Afinidade, AfinidadeService, PessoaCommand, PessoaService } from "se-ex-client/dist";
import { MatSnackBar } from "@angular/material/snack-bar";
import { toApiError } from "../../../../to-api-error";
import EstadosEnum = Afinidade.EstadosEnum;

@Component({
  selector: 'app-pessoa-create',
  templateUrl: './pessoa-create.component.html',
  styleUrls: ['./pessoa-create.component.scss']
})
export class PessoaCreateComponent implements OnInit {

  pessoaCommand: PessoaCommand = {};
  regioes: Afinidade[] = [];
  estados = Object.values(EstadosEnum)
  loading = false;

  constructor(private readonly _router: Router,
              private readonly _snackBarService: MatSnackBar,
              private readonly _regiaoService: AfinidadeService,
              private readonly _pessoaService: PessoaService) {
  }

  ngOnInit() {
    this._fetchRegioes();
  }

  cancel(): void {
    this._router.navigate(['/admin/pessoas']);
  }

  async addPessoa(): Promise<void> {
    try {
      this.loading = true;
      await this._pessoaService.savePessoa(this.pessoaCommand).toPromise();
      this._snackBarService.open('Pessoa criada com sucesso.', 'Fechar');
      this.cancel();
    } catch (e) {
      const apiError = toApiError(e);
      const message = apiError ? apiError : 'Erro ao criar pessoa, tente novamente mais tarde.';
      this._snackBarService.open(message, 'Fechar');
    } finally {
      this.loading = false;
    }
  }

  private async _fetchRegioes(): Promise<void> {
    try {
      const regioes = await this._regiaoService.listAllAfinidades().toPromise();
      this.regioes = regioes ? regioes : [];
    } catch (e) {
      this._snackBarService.open('Erro ao listar as afinidades, tente novamente mais tarde.', 'Fechar');
    }
  }

}

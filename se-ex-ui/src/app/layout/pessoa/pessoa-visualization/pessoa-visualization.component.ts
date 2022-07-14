import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from "@angular/router";
import { PessoaService } from "se-ex-client/dist";
import { SingularPessoaDto } from "se-ex-client/dist/target/generated-sources/openapi/model/singularPessoaDto";
import { MatSnackBar } from "@angular/material/snack-bar";

const ID_KEY = "id";

@Component({
  selector: 'app-pessoa-visualization',
  templateUrl: './pessoa-visualization.component.html',
  styleUrls: ['./pessoa-visualization.component.scss']
})
export class PessoaVisualizationComponent implements OnInit {

  pessoa?: SingularPessoaDto;
  loading = false;

  id?: string | null;

  constructor(private readonly _router: Router,
              private readonly _pessoaService: PessoaService,
              private readonly _snackBarService: MatSnackBar,
              private readonly _activatedRoute: ActivatedRoute,) {
    this.id = this._activatedRoute.snapshot.paramMap.get(ID_KEY);
  }

  ngOnInit(): void {
    this._loadPessoa();
  }

  cancel(): void {
    this._router.navigate(['/admin/pessoas']);
  }

  private async _loadPessoa(): Promise<void> {
    if (!this.id) {
      return
    }
    try {
      this.loading = true;
      this.pessoa = await this._pessoaService.findById(Number(this.id)).toPromise();
      if (!this.pessoa) {
        this._snackBarService.open("Nenhuma pessoa encontrada com o id: " + this.id, 'Fechar');
        this.cancel();
      }
    } catch (e) {
      this._snackBarService.open("Erro ao buscar pessoa com id: " + this.id, 'Fechar');
      this.cancel();
    } finally {
      this.loading = false;
    }
  }

}

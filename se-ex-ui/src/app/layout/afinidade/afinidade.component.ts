import { Component, OnInit } from '@angular/core';
import { Afinidade, AfinidadeService } from "se-ex-client/dist";
import { MatSnackBar } from "@angular/material/snack-bar";
import EstadosEnum = Afinidade.EstadosEnum;

@Component({
  selector: 'app-afinidade',
  templateUrl: './afinidade.component.html',
  styleUrls: ['./afinidade.component.scss']
})
export class AfinidadeComponent implements OnInit {

  loading = false;
  afinidades: Afinidade[] = [];
  estados = Object.values(EstadosEnum);
  afinidadeCommand: Afinidade = {};

  constructor(private readonly _afinidadeService: AfinidadeService,
              private readonly _snackBarService: MatSnackBar,
  ) { }

  ngOnInit(): void {
    this._fetchAfinidades();
  }

  async save(): Promise<void> {
    try {
      this.loading = true;
      await this._afinidadeService.saveAfinidade(this.afinidadeCommand).toPromise();
      this._snackBarService.open('Afinidade cadastrada com sucesso', 'Fechar');
      this._fetchAfinidades();
    } catch (e) {
      this._snackBarService.open('Ocorreu um erro ao cadastrar a afinidade', 'Fechar');
    } finally {
      this.loading = false;
    }
  }

  private async _fetchAfinidades(): Promise<void> {
    try {
      this.loading = true;
      const afinidades = await this._afinidadeService.listAllAfinidades().toPromise();
      this.afinidades = afinidades ? afinidades : [];
    } catch (e) {
      this._snackBarService.open('Ocorreu um erro ao listar as afinidades', 'Fechar');
    } finally {
      this.loading = false;
    }
  }

}

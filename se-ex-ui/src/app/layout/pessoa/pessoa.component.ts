import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from "@angular/material/table";
import { MatSnackBar } from "@angular/material/snack-bar";
import { PessoaInListDto, PessoaService } from "se-ex-client/dist";

enum Column {
  NOME = 'NOME',
  IDADE = 'IDADE',
  SCORE = 'SCORE',
  ACTIONS = 'ACTIONS',
}

@Component({
  selector: 'app-pessoa',
  templateUrl: './pessoa.component.html',
  styleUrls: ['./pessoa.component.scss']
})
export class PessoaComponent implements OnInit {

  dataSource = new MatTableDataSource<PessoaInListDto>();
  readonly displayedColumns = Object.values(Column);
  readonly Column = Column;

  quering = false;

  constructor(private readonly _snackBarService: MatSnackBar,
              private readonly _pessoaService: PessoaService,
  ) { }

  ngOnInit(): void {
    this.fetchPessoas();
  }

  async fetchPessoas(): Promise<void> {
    try {
      this.quering = true;
      const pessoas = await this._pessoaService.listAllPessoas().toPromise();
      this.dataSource.data = pessoas ? pessoas : [];
    } catch (e) {
      this._snackBarService.open('Erro ao listar pessoas, tente novamente mais tarde', 'Fechar');
    } finally {
      this.quering = false;
    }
  }

}

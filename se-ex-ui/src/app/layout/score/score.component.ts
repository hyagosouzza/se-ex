import { Component, OnInit } from '@angular/core';
import { Score, ScoreService } from "se-ex-client/dist";
import { MatSnackBar } from "@angular/material/snack-bar";

@Component({
  selector: 'app-score',
  templateUrl: './score.component.html',
  styleUrls: ['./score.component.scss']
})
export class ScoreComponent implements OnInit {

  loading = false;
  scores: Score[] = [];

  constructor(private readonly _scoreService: ScoreService,
              private readonly _snackBarService: MatSnackBar,
  ) { }

  ngOnInit(): void {
    this._fetchScores();
  }

  private async _fetchScores(): Promise<void> {
    try {
      this.loading = true;
      const scores = await this._scoreService.listAllScores().toPromise();
      this.scores = scores ? scores : [];
    } catch (e) {
      this._snackBarService.open('Ocorreu um erro ao listar os scores', 'Fechar');
    } finally {
      this.loading = false;
    }
  }

}

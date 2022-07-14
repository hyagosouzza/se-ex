import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LayoutComponent } from './layout.component';
import { SharedModule } from "../shared/shared.module";
import { ScoreModule } from "./score/score.module";
import { PessoaModule } from "./pessoa/pessoa.module";
import { AfinidadeModule } from "./afinidade/afinidade.module";
import { MatSidenavModule } from "@angular/material/sidenav";
import { RouterModule } from "@angular/router";
import { MatSnackBarModule } from "@angular/material/snack-bar";
import { HttpClientModule } from "@angular/common/http";

@NgModule({
  declarations: [
    LayoutComponent
  ],
  imports: [
    CommonModule,
    SharedModule,
    ScoreModule,
    PessoaModule,
    HttpClientModule,
    AfinidadeModule,
    MatSidenavModule,
    RouterModule,
    MatSnackBarModule,
  ]
})
export class LayoutModule {}

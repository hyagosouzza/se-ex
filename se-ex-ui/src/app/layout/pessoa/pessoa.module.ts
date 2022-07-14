import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PessoaComponent } from './pessoa.component';
import { PessoaCreateComponent } from './pessoa-create/pessoa-create.component';
import { MatIconModule } from "@angular/material/icon";
import { MatCardModule } from "@angular/material/card";
import { MatProgressBarModule } from "@angular/material/progress-bar";
import { MatTableModule } from "@angular/material/table";
import { MatMenuModule } from "@angular/material/menu";
import { RouterModule } from "@angular/router";
import { MatFormFieldModule } from "@angular/material/form-field";
import { FormsModule } from "@angular/forms";
import { MatDatepickerModule } from "@angular/material/datepicker";
import { MatGridListModule } from "@angular/material/grid-list";
import { MatButtonModule } from "@angular/material/button";
import { MatInputModule } from "@angular/material/input";
import { PessoaVisualizationComponent } from "./pessoa-visualization/pessoa-visualization.component";
import { MatTooltipModule } from "@angular/material/tooltip";
import { MatOptionModule } from "@angular/material/core";
import { MatSelectModule } from "@angular/material/select";
import { NgxMaskModule } from "ngx-mask";

@NgModule({
  declarations: [
    PessoaComponent,
    PessoaCreateComponent,
    PessoaVisualizationComponent,
  ],
  imports: [
    CommonModule,
    MatIconModule,
    MatCardModule,
    MatProgressBarModule,
    MatTableModule,
    MatMenuModule,
    RouterModule,
    MatFormFieldModule,
    FormsModule,
    MatDatepickerModule,
    MatGridListModule,
    MatButtonModule,
    MatInputModule,
    MatTooltipModule,
    MatOptionModule,
    MatSelectModule,
    NgxMaskModule
  ]
})
export class PessoaModule {}

import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from "@angular/material/dialog";
import { ConfirmDialogOptions } from "./confirm-dialog.service";

@Component({
  selector: 'app-confirm-dialog',
  templateUrl: './confirm-dialog.component.html',
  styleUrls: ['./confirm-dialog.component.scss']
})
export class ConfirmDialogComponent {

  constructor(@Inject(MAT_DIALOG_DATA) public data: ConfirmDialogOptions,
              private readonly _dialogRef: MatDialogRef<ConfirmDialogComponent>,) {
  }

  close(value = false): void {
    this._dialogRef.close(value);
  }

}

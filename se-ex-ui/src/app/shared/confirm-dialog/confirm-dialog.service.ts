import { Injectable } from '@angular/core';
import { MatDialog } from "@angular/material/dialog";
import { ConfirmDialogComponent } from "./confirm-dialog.component";

export interface ConfirmDialogOptions {
  title: string;
  message: string;
  confirm?: string;
  decline?: string;
}

@Injectable({
  providedIn: 'root'
})
export class ConfirmDialogService {

  constructor(private readonly _dialogService: MatDialog) { }

  async openDialog(options: ConfirmDialogOptions): Promise<unknown> {
    return this._dialogService.open(ConfirmDialogComponent, {
      data: options,
      minWidth: '300px'
    }).beforeClosed().toPromise();
  }

}

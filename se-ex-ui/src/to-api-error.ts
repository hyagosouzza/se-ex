import { HttpErrorResponse } from "@angular/common/http";

export const toApiError = (ex: unknown): string | undefined => {
  if (ex instanceof HttpErrorResponse) {
    const { message } = ex.error;
    return message ? message.toString() : '';
  }
  return undefined
}

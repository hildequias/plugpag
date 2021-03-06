package br.uol.pagseguro.client.pagcafe.task;

import br.uol.pagseguro.client.pagcafe.model.Transaction;


public interface TransactionErrorCallback {

    /**
     * Called when the transaction task has finished with error.
     *
     * @param result Results generated by the transaction.
     */
    void onError(Transaction result);

}

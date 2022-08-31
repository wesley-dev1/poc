package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*;


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("app-TAMANHO_CLIENTE_POCDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface TAMANHO_CLIENTE_POCDAO extends JpaRepository<TAMANHO_CLIENTE_POC, java.lang.String> {

}
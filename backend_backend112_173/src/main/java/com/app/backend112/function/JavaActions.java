package com.app.backend112.function;

import com.app.backend112.model.Organization;
import com.app.backend112.model.EmployeePersonalInfo;
import com.app.backend112.model.EmlpoyeeProfile;




import com.app.backend112.enums.EmploymentType;
import com.app.backend112.enums.OrgDept;
import com.app.backend112.enums.OrgBranch;
import com.app.backend112.converter.OrgBranchConverter;
import com.app.backend112.converter.EmploymentTypeConverter;
import com.app.backend112.converter.OrgDeptConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  
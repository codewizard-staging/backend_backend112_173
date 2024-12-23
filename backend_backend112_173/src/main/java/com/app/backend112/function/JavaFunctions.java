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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.backend112.repository.OrganizationRepository;
import com.app.backend112.repository.EmployeePersonalInfoRepository;
import com.app.backend112.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   

package com.rentguruz.app.b2b.carclick.model.base;

import java.io.Serializable;

public class AuditLogModel  implements Serializable {

    public int id,companyId,auditType,auditFor,createdBy,createdDate;

}

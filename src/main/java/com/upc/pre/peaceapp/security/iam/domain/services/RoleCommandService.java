package com.upc.pre.peaceapp.security.iam.domain.services;


import com.upc.pre.peaceapp.security.iam.domain.model.commands.SeedRolesCommand;

public interface RoleCommandService {
    void handle(SeedRolesCommand command);
}

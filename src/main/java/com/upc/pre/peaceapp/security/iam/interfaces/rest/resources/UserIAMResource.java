package com.upc.pre.peaceapp.security.iam.interfaces.rest.resources;

import java.util.List;

public record UserIAMResource(Long id, String username, List<String> roles) {
}

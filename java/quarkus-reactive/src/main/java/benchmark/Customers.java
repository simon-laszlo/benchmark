package benchmark;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public record Customers(String guid, String first_name, String last_name, String email, String address) {
  
}

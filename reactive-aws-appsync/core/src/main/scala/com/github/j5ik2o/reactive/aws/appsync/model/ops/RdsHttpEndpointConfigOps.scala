// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class RdsHttpEndpointConfigBuilderOps(val self: RdsHttpEndpointConfig.Builder) extends AnyVal {

  final def withAwsRegionAsScala(value: Option[String]): RdsHttpEndpointConfig.Builder = {
    value.fold(self) { v =>
      self.awsRegion(v)
    }
  } // String

  final def withDbClusterIdentifierAsScala(value: Option[String]): RdsHttpEndpointConfig.Builder = {
    value.fold(self) { v =>
      self.dbClusterIdentifier(v)
    }
  } // String

  final def withDatabaseNameAsScala(value: Option[String]): RdsHttpEndpointConfig.Builder = {
    value.fold(self) { v =>
      self.databaseName(v)
    }
  } // String

  final def withSchemaAsScala(value: Option[String]): RdsHttpEndpointConfig.Builder = {
    value.fold(self) { v =>
      self.schema(v)
    }
  } // String

  final def withAwsSecretStoreArnAsScala(value: Option[String]): RdsHttpEndpointConfig.Builder = {
    value.fold(self) { v =>
      self.awsSecretStoreArn(v)
    }
  } // String

}

final class RdsHttpEndpointConfigOps(val self: RdsHttpEndpointConfig) extends AnyVal {

  final def awsRegionAsScala: Option[String] = Option(self.awsRegion) // String

  final def dbClusterIdentifierAsScala: Option[String] = Option(self.dbClusterIdentifier) // String

  final def databaseNameAsScala: Option[String] = Option(self.databaseName) // String

  final def schemaAsScala: Option[String] = Option(self.schema) // String

  final def awsSecretStoreArnAsScala: Option[String] = Option(self.awsSecretStoreArn) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRdsHttpEndpointConfigOps {

  implicit def toRdsHttpEndpointConfigBuilderOps(v: RdsHttpEndpointConfig.Builder): RdsHttpEndpointConfigBuilderOps =
    new RdsHttpEndpointConfigBuilderOps(v)

  implicit def toRdsHttpEndpointConfigOps(v: RdsHttpEndpointConfig): RdsHttpEndpointConfigOps =
    new RdsHttpEndpointConfigOps(v)

}

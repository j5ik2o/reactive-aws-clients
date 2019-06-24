// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class RdsHttpEndpointConfigBuilderOps(val self: RdsHttpEndpointConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def awsRegionAsScala(value: Option[String]): RdsHttpEndpointConfig.Builder = {
    value.fold(self) { v =>
      self.awsRegion(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dbClusterIdentifierAsScala(value: Option[String]): RdsHttpEndpointConfig.Builder = {
    value.fold(self) { v =>
      self.dbClusterIdentifier(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def databaseNameAsScala(value: Option[String]): RdsHttpEndpointConfig.Builder = {
    value.fold(self) { v =>
      self.databaseName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def schemaAsScala(value: Option[String]): RdsHttpEndpointConfig.Builder = {
    value.fold(self) { v =>
      self.schema(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def awsSecretStoreArnAsScala(value: Option[String]): RdsHttpEndpointConfig.Builder = {
    value.fold(self) { v =>
      self.awsSecretStoreArn(v)
    }
  }

}

final class RdsHttpEndpointConfigOps(val self: RdsHttpEndpointConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def awsRegionAsScala: Option[String] = Option(self.awsRegion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dbClusterIdentifierAsScala: Option[String] = Option(self.dbClusterIdentifier)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def databaseNameAsScala: Option[String] = Option(self.databaseName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def schemaAsScala: Option[String] = Option(self.schema)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def awsSecretStoreArnAsScala: Option[String] = Option(self.awsSecretStoreArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRdsHttpEndpointConfigOps {

  implicit def toRdsHttpEndpointConfigBuilderOps(v: RdsHttpEndpointConfig.Builder): RdsHttpEndpointConfigBuilderOps =
    new RdsHttpEndpointConfigBuilderOps(v)

  implicit def toRdsHttpEndpointConfigOps(v: RdsHttpEndpointConfig): RdsHttpEndpointConfigOps =
    new RdsHttpEndpointConfigOps(v)

}

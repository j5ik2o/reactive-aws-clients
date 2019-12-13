// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeTypeResponseBuilderOps(val self: DescribeTypeResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[RegistryType]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala(value: Option[String]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultVersionIdAsScala(value: Option[String]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.defaultVersionId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def schemaAsScala(value: Option[String]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.schema(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisioningTypeAsScala(value: Option[ProvisioningType]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.provisioningType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deprecatedStatusAsScala(value: Option[DeprecatedStatus]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.deprecatedStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loggingConfigAsScala(value: Option[LoggingConfig]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.loggingConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionRoleArnAsScala(value: Option[String]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.executionRoleArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def visibilityAsScala(value: Option[Visibility]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.visibility(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceUrlAsScala(value: Option[String]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.sourceUrl(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def documentationUrlAsScala(value: Option[String]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.documentationUrl(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedAsScala(value: Option[java.time.Instant]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.lastUpdated(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeCreatedAsScala(value: Option[java.time.Instant]): DescribeTypeResponse.Builder = {
    value.fold(self) { v =>
      self.timeCreated(v)
    }
  }

}

final class DescribeTypeResponseOps(val self: DescribeTypeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[RegistryType] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala: Option[String] = Option(self.typeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultVersionIdAsScala: Option[String] = Option(self.defaultVersionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def schemaAsScala: Option[String] = Option(self.schema)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisioningTypeAsScala: Option[ProvisioningType] = Option(self.provisioningType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deprecatedStatusAsScala: Option[DeprecatedStatus] = Option(self.deprecatedStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loggingConfigAsScala: Option[LoggingConfig] = Option(self.loggingConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionRoleArnAsScala: Option[String] = Option(self.executionRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def visibilityAsScala: Option[Visibility] = Option(self.visibility)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceUrlAsScala: Option[String] = Option(self.sourceUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def documentationUrlAsScala: Option[String] = Option(self.documentationUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedAsScala: Option[java.time.Instant] = Option(self.lastUpdated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeCreatedAsScala: Option[java.time.Instant] = Option(self.timeCreated)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTypeResponseOps {

  implicit def toDescribeTypeResponseBuilderOps(v: DescribeTypeResponse.Builder): DescribeTypeResponseBuilderOps =
    new DescribeTypeResponseBuilderOps(v)

  implicit def toDescribeTypeResponseOps(v: DescribeTypeResponse): DescribeTypeResponseOps =
    new DescribeTypeResponseOps(v)

}

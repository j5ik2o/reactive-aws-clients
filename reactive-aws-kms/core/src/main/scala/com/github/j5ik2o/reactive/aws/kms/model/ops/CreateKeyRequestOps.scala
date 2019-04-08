// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class CreateKeyRequestBuilderOps(val self: CreateKeyRequest.Builder) extends AnyVal {

  final def policyAsScala(value: Option[String]): CreateKeyRequest.Builder = {
    value.fold(self) { v =>
      self.policy(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateKeyRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def keyUsageAsScala(value: Option[KeyUsageType]): CreateKeyRequest.Builder = {
    value.fold(self) { v =>
      self.keyUsage(v)
    }
  }

  final def originAsScala(value: Option[OriginType]): CreateKeyRequest.Builder = {
    value.fold(self) { v =>
      self.origin(v)
    }
  }

  final def customKeyStoreIdAsScala(value: Option[String]): CreateKeyRequest.Builder = {
    value.fold(self) { v =>
      self.customKeyStoreId(v)
    }
  }

  final def bypassPolicyLockoutSafetyCheckAsScala(value: Option[Boolean]): CreateKeyRequest.Builder = {
    value.fold(self) { v =>
      self.bypassPolicyLockoutSafetyCheck(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): CreateKeyRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class CreateKeyRequestOps(val self: CreateKeyRequest) extends AnyVal {

  final def policyAsScala: Option[String] = Option(self.policy)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def keyUsageAsScala: Option[KeyUsageType] = Option(self.keyUsage)

  final def originAsScala: Option[OriginType] = Option(self.origin)

  final def customKeyStoreIdAsScala: Option[String] = Option(self.customKeyStoreId)

  final def bypassPolicyLockoutSafetyCheckAsScala: Option[Boolean] = Option(self.bypassPolicyLockoutSafetyCheck)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateKeyRequestOps {

  implicit def toCreateKeyRequestBuilderOps(v: CreateKeyRequest.Builder): CreateKeyRequestBuilderOps =
    new CreateKeyRequestBuilderOps(v)

  implicit def toCreateKeyRequestOps(v: CreateKeyRequest): CreateKeyRequestOps = new CreateKeyRequestOps(v)

}

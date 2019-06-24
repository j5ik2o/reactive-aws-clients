// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class CreateKeyRequestBuilderOps(val self: CreateKeyRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyAsScala(value: Option[String]): CreateKeyRequest.Builder = {
    value.fold(self) { v =>
      self.policy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateKeyRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyUsageAsScala(value: Option[KeyUsageType]): CreateKeyRequest.Builder = {
    value.fold(self) { v =>
      self.keyUsage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def originAsScala(value: Option[OriginType]): CreateKeyRequest.Builder = {
    value.fold(self) { v =>
      self.origin(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreIdAsScala(value: Option[String]): CreateKeyRequest.Builder = {
    value.fold(self) { v =>
      self.customKeyStoreId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bypassPolicyLockoutSafetyCheckAsScala(value: Option[Boolean]): CreateKeyRequest.Builder = {
    value.fold(self) { v =>
      self.bypassPolicyLockoutSafetyCheck(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CreateKeyRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class CreateKeyRequestOps(val self: CreateKeyRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyAsScala: Option[String] = Option(self.policy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyUsageAsScala: Option[KeyUsageType] = Option(self.keyUsage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def originAsScala: Option[OriginType] = Option(self.origin)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreIdAsScala: Option[String] = Option(self.customKeyStoreId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bypassPolicyLockoutSafetyCheckAsScala: Option[Boolean] = Option(self.bypassPolicyLockoutSafetyCheck)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateKeyRequestOps {

  implicit def toCreateKeyRequestBuilderOps(v: CreateKeyRequest.Builder): CreateKeyRequestBuilderOps =
    new CreateKeyRequestBuilderOps(v)

  implicit def toCreateKeyRequestOps(v: CreateKeyRequest): CreateKeyRequestOps = new CreateKeyRequestOps(v)

}

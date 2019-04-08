// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class PutKeyPolicyRequestBuilderOps(val self: PutKeyPolicyRequest.Builder) extends AnyVal {

  final def keyIdAsScala(value: Option[String]): PutKeyPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  final def policyNameAsScala(value: Option[String]): PutKeyPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.policyName(v)
    }
  }

  final def policyAsScala(value: Option[String]): PutKeyPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.policy(v)
    }
  }

  final def bypassPolicyLockoutSafetyCheckAsScala(value: Option[Boolean]): PutKeyPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.bypassPolicyLockoutSafetyCheck(v)
    }
  }

}

final class PutKeyPolicyRequestOps(val self: PutKeyPolicyRequest) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId)

  final def policyNameAsScala: Option[String] = Option(self.policyName)

  final def policyAsScala: Option[String] = Option(self.policy)

  final def bypassPolicyLockoutSafetyCheckAsScala: Option[Boolean] = Option(self.bypassPolicyLockoutSafetyCheck)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutKeyPolicyRequestOps {

  implicit def toPutKeyPolicyRequestBuilderOps(v: PutKeyPolicyRequest.Builder): PutKeyPolicyRequestBuilderOps =
    new PutKeyPolicyRequestBuilderOps(v)

  implicit def toPutKeyPolicyRequestOps(v: PutKeyPolicyRequest): PutKeyPolicyRequestOps = new PutKeyPolicyRequestOps(v)

}

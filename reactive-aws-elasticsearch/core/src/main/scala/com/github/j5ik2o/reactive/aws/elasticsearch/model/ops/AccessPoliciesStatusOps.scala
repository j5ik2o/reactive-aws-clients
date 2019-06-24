// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AccessPoliciesStatusBuilderOps(val self: AccessPoliciesStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala(value: Option[String]): AccessPoliciesStatus.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[OptionStatus]): AccessPoliciesStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class AccessPoliciesStatusOps(val self: AccessPoliciesStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala: Option[String] = Option(self.options)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[OptionStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAccessPoliciesStatusOps {

  implicit def toAccessPoliciesStatusBuilderOps(v: AccessPoliciesStatus.Builder): AccessPoliciesStatusBuilderOps =
    new AccessPoliciesStatusBuilderOps(v)

  implicit def toAccessPoliciesStatusOps(v: AccessPoliciesStatus): AccessPoliciesStatusOps =
    new AccessPoliciesStatusOps(v)

}

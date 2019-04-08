// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AccessPoliciesStatusBuilderOps(val self: AccessPoliciesStatus.Builder) extends AnyVal {

  final def optionsAsScala(value: Option[String]): AccessPoliciesStatus.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  } // String

  final def statusAsScala(value: Option[OptionStatus]): AccessPoliciesStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // OptionStatus

}

final class AccessPoliciesStatusOps(val self: AccessPoliciesStatus) extends AnyVal {

  final def optionsAsScala: Option[String] = Option(self.options) // String

  final def statusAsScala: Option[OptionStatus] = Option(self.status) // OptionStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAccessPoliciesStatusOps {

  implicit def toAccessPoliciesStatusBuilderOps(v: AccessPoliciesStatus.Builder): AccessPoliciesStatusBuilderOps =
    new AccessPoliciesStatusBuilderOps(v)

  implicit def toAccessPoliciesStatusOps(v: AccessPoliciesStatus): AccessPoliciesStatusOps =
    new AccessPoliciesStatusOps(v)

}

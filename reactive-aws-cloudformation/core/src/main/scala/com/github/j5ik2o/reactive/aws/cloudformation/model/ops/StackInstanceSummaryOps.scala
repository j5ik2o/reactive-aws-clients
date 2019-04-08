// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackInstanceSummaryBuilderOps(val self: StackInstanceSummary.Builder) extends AnyVal {

  final def stackSetIdAsScala(value: Option[String]): StackInstanceSummary.Builder = {
    value.fold(self) { v =>
      self.stackSetId(v)
    }
  } // String

  final def regionAsScala(value: Option[String]): StackInstanceSummary.Builder = {
    value.fold(self) { v =>
      self.region(v)
    }
  } // String

  final def accountAsScala(value: Option[String]): StackInstanceSummary.Builder = {
    value.fold(self) { v =>
      self.account(v)
    }
  } // String

  final def stackIdAsScala(value: Option[String]): StackInstanceSummary.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  } // String

  final def statusAsScala(value: Option[StackInstanceStatus]): StackInstanceSummary.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // StackInstanceStatus

  final def statusReasonAsScala(value: Option[String]): StackInstanceSummary.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  } // String

}

final class StackInstanceSummaryOps(val self: StackInstanceSummary) extends AnyVal {

  final def stackSetIdAsScala: Option[String] = Option(self.stackSetId) // String

  final def regionAsScala: Option[String] = Option(self.region) // String

  final def accountAsScala: Option[String] = Option(self.account) // String

  final def stackIdAsScala: Option[String] = Option(self.stackId) // String

  final def statusAsScala: Option[StackInstanceStatus] = Option(self.status) // StackInstanceStatus

  final def statusReasonAsScala: Option[String] = Option(self.statusReason) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackInstanceSummaryOps {

  implicit def toStackInstanceSummaryBuilderOps(v: StackInstanceSummary.Builder): StackInstanceSummaryBuilderOps =
    new StackInstanceSummaryBuilderOps(v)

  implicit def toStackInstanceSummaryOps(v: StackInstanceSummary): StackInstanceSummaryOps =
    new StackInstanceSummaryOps(v)

}

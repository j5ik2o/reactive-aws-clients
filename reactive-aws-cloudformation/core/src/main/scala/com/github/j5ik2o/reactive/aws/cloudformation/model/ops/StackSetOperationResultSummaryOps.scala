// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSetOperationResultSummaryBuilderOps(val self: StackSetOperationResultSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountAsScala(value: Option[String]): StackSetOperationResultSummary.Builder = {
    value.fold(self) { v =>
      self.account(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionAsScala(value: Option[String]): StackSetOperationResultSummary.Builder = {
    value.fold(self) { v =>
      self.region(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[StackSetOperationResultStatus]): StackSetOperationResultSummary.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala(value: Option[String]): StackSetOperationResultSummary.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountGateResultAsScala(value: Option[AccountGateResult]): StackSetOperationResultSummary.Builder = {
    value.fold(self) { v =>
      self.accountGateResult(v)
    }
  }

}

final class StackSetOperationResultSummaryOps(val self: StackSetOperationResultSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountAsScala: Option[String] = Option(self.account)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionAsScala: Option[String] = Option(self.region)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[StackSetOperationResultStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountGateResultAsScala: Option[AccountGateResult] = Option(self.accountGateResult)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSetOperationResultSummaryOps {

  implicit def toStackSetOperationResultSummaryBuilderOps(
      v: StackSetOperationResultSummary.Builder
  ): StackSetOperationResultSummaryBuilderOps = new StackSetOperationResultSummaryBuilderOps(v)

  implicit def toStackSetOperationResultSummaryOps(
      v: StackSetOperationResultSummary
  ): StackSetOperationResultSummaryOps = new StackSetOperationResultSummaryOps(v)

}

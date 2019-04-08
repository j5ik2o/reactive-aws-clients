// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSetOperationSummaryBuilderOps(val self: StackSetOperationSummary.Builder) extends AnyVal {

  final def operationIdAsScala(value: Option[String]): StackSetOperationSummary.Builder = {
    value.fold(self) { v =>
      self.operationId(v)
    }
  }

  final def actionAsScala(value: Option[StackSetOperationAction]): StackSetOperationSummary.Builder = {
    value.fold(self) { v =>
      self.action(v)
    }
  }

  final def statusAsScala(value: Option[StackSetOperationStatus]): StackSetOperationSummary.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def creationTimestampAsScala(value: Option[java.time.Instant]): StackSetOperationSummary.Builder = {
    value.fold(self) { v =>
      self.creationTimestamp(v)
    }
  }

  final def endTimestampAsScala(value: Option[java.time.Instant]): StackSetOperationSummary.Builder = {
    value.fold(self) { v =>
      self.endTimestamp(v)
    }
  }

}

final class StackSetOperationSummaryOps(val self: StackSetOperationSummary) extends AnyVal {

  final def operationIdAsScala: Option[String] = Option(self.operationId)

  final def actionAsScala: Option[StackSetOperationAction] = Option(self.action)

  final def statusAsScala: Option[StackSetOperationStatus] = Option(self.status)

  final def creationTimestampAsScala: Option[java.time.Instant] = Option(self.creationTimestamp)

  final def endTimestampAsScala: Option[java.time.Instant] = Option(self.endTimestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSetOperationSummaryOps {

  implicit def toStackSetOperationSummaryBuilderOps(
      v: StackSetOperationSummary.Builder
  ): StackSetOperationSummaryBuilderOps = new StackSetOperationSummaryBuilderOps(v)

  implicit def toStackSetOperationSummaryOps(v: StackSetOperationSummary): StackSetOperationSummaryOps =
    new StackSetOperationSummaryOps(v)

}

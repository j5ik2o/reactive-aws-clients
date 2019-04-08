// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSetSummaryBuilderOps(val self: StackSetSummary.Builder) extends AnyVal {

  final def stackSetNameAsScala(value: Option[String]): StackSetSummary.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  }

  final def stackSetIdAsScala(value: Option[String]): StackSetSummary.Builder = {
    value.fold(self) { v =>
      self.stackSetId(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): StackSetSummary.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def statusAsScala(value: Option[StackSetStatus]): StackSetSummary.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class StackSetSummaryOps(val self: StackSetSummary) extends AnyVal {

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

  final def stackSetIdAsScala: Option[String] = Option(self.stackSetId)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def statusAsScala: Option[StackSetStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSetSummaryOps {

  implicit def toStackSetSummaryBuilderOps(v: StackSetSummary.Builder): StackSetSummaryBuilderOps =
    new StackSetSummaryBuilderOps(v)

  implicit def toStackSetSummaryOps(v: StackSetSummary): StackSetSummaryOps = new StackSetSummaryOps(v)

}

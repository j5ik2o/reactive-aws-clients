// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ContainerSummaryBuilderOps(val self: ContainerSummary.Builder) extends AnyVal {

  final def exitCodeAsScala(value: Option[Int]): ContainerSummary.Builder = {
    value.fold(self) { v =>
      self.exitCode(v)
    }
  } // Int

  final def reasonAsScala(value: Option[String]): ContainerSummary.Builder = {
    value.fold(self) { v =>
      self.reason(v)
    }
  } // String

}

final class ContainerSummaryOps(val self: ContainerSummary) extends AnyVal {

  final def exitCodeAsScala: Option[Int] = Option(self.exitCode) // Int

  final def reasonAsScala: Option[String] = Option(self.reason) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerSummaryOps {

  implicit def toContainerSummaryBuilderOps(v: ContainerSummary.Builder): ContainerSummaryBuilderOps =
    new ContainerSummaryBuilderOps(v)

  implicit def toContainerSummaryOps(v: ContainerSummary): ContainerSummaryOps = new ContainerSummaryOps(v)

}

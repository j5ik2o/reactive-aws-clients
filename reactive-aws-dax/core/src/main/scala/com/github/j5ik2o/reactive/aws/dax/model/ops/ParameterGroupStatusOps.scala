// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class ParameterGroupStatusBuilderOps(val self: ParameterGroupStatus.Builder) extends AnyVal {

  final def parameterGroupNameAsScala(value: Option[String]): ParameterGroupStatus.Builder = {
    value.fold(self) { v =>
      self.parameterGroupName(v)
    }
  }

  final def parameterApplyStatusAsScala(value: Option[String]): ParameterGroupStatus.Builder = {
    value.fold(self) { v =>
      self.parameterApplyStatus(v)
    }
  }

  final def nodeIdsToRebootAsScala(value: Option[Seq[String]]): ParameterGroupStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.nodeIdsToReboot(v.asJava)
    }
  }

}

final class ParameterGroupStatusOps(val self: ParameterGroupStatus) extends AnyVal {

  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName)

  final def parameterApplyStatusAsScala: Option[String] = Option(self.parameterApplyStatus)

  final def nodeIdsToRebootAsScala: Option[Seq[String]] = Option(self.nodeIdsToReboot).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParameterGroupStatusOps {

  implicit def toParameterGroupStatusBuilderOps(v: ParameterGroupStatus.Builder): ParameterGroupStatusBuilderOps =
    new ParameterGroupStatusBuilderOps(v)

  implicit def toParameterGroupStatusOps(v: ParameterGroupStatus): ParameterGroupStatusOps =
    new ParameterGroupStatusOps(v)

}

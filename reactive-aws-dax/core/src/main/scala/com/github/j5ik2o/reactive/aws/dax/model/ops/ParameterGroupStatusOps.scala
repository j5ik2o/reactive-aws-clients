// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class ParameterGroupStatusBuilderOps(val self: ParameterGroupStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupNameAsScala(value: Option[String]): ParameterGroupStatus.Builder = {
    value.fold(self) { v => self.parameterGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterApplyStatusAsScala(value: Option[String]): ParameterGroupStatus.Builder = {
    value.fold(self) { v => self.parameterApplyStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeIdsToRebootAsScala(value: Option[Seq[String]]): ParameterGroupStatus.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.nodeIdsToReboot(v.asJava)
    }
  }

}

final class ParameterGroupStatusOps(val self: ParameterGroupStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterApplyStatusAsScala: Option[String] = Option(self.parameterApplyStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeIdsToRebootAsScala: Option[Seq[String]] =
    Option(self.nodeIdsToReboot).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParameterGroupStatusOps {

  implicit def toParameterGroupStatusBuilderOps(v: ParameterGroupStatus.Builder): ParameterGroupStatusBuilderOps =
    new ParameterGroupStatusBuilderOps(v)

  implicit def toParameterGroupStatusOps(v: ParameterGroupStatus): ParameterGroupStatusOps =
    new ParameterGroupStatusOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class TaskOverrideBuilderOps(val self: TaskOverride.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerOverridesAsScala(value: Option[Seq[ContainerOverride]]): TaskOverride.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.containerOverrides(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuAsScala(value: Option[String]): TaskOverride.Builder = {
    value.fold(self) { v => self.cpu(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inferenceAcceleratorOverridesAsScala(
      value: Option[Seq[InferenceAcceleratorOverride]]
  ): TaskOverride.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.inferenceAcceleratorOverrides(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionRoleArnAsScala(value: Option[String]): TaskOverride.Builder = {
    value.fold(self) { v => self.executionRoleArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala(value: Option[String]): TaskOverride.Builder = {
    value.fold(self) { v => self.memory(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskRoleArnAsScala(value: Option[String]): TaskOverride.Builder = {
    value.fold(self) { v => self.taskRoleArn(v) }
  }

}

final class TaskOverrideOps(val self: TaskOverride) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerOverridesAsScala: Option[Seq[ContainerOverride]] =
    Option(self.containerOverrides).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuAsScala: Option[String] = Option(self.cpu)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inferenceAcceleratorOverridesAsScala: Option[Seq[InferenceAcceleratorOverride]] =
    Option(self.inferenceAcceleratorOverrides).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionRoleArnAsScala: Option[String] = Option(self.executionRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala: Option[String] = Option(self.memory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskRoleArnAsScala: Option[String] = Option(self.taskRoleArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTaskOverrideOps {

  implicit def toTaskOverrideBuilderOps(v: TaskOverride.Builder): TaskOverrideBuilderOps = new TaskOverrideBuilderOps(v)

  implicit def toTaskOverrideOps(v: TaskOverride): TaskOverrideOps = new TaskOverrideOps(v)

}

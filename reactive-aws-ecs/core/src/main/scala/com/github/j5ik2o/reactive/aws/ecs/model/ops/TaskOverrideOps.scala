// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class TaskOverrideBuilderOps(val self: TaskOverride.Builder) extends AnyVal {

  final def containerOverridesAsScala(value: Option[Seq[ContainerOverride]]): TaskOverride.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.containerOverrides(v.asJava)
    }
  }

  final def taskRoleArnAsScala(value: Option[String]): TaskOverride.Builder = {
    value.fold(self) { v =>
      self.taskRoleArn(v)
    }
  }

  final def executionRoleArnAsScala(value: Option[String]): TaskOverride.Builder = {
    value.fold(self) { v =>
      self.executionRoleArn(v)
    }
  }

}

final class TaskOverrideOps(val self: TaskOverride) extends AnyVal {

  final def containerOverridesAsScala: Option[Seq[ContainerOverride]] = Option(self.containerOverrides).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def taskRoleArnAsScala: Option[String] = Option(self.taskRoleArn)

  final def executionRoleArnAsScala: Option[String] = Option(self.executionRoleArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTaskOverrideOps {

  implicit def toTaskOverrideBuilderOps(v: TaskOverride.Builder): TaskOverrideBuilderOps = new TaskOverrideBuilderOps(v)

  implicit def toTaskOverrideOps(v: TaskOverride): TaskOverrideOps = new TaskOverrideOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class RegisterTaskDefinitionResponseBuilderOps(val self: RegisterTaskDefinitionResponse.Builder) extends AnyVal {

  final def taskDefinitionAsScala(value: Option[TaskDefinition]): RegisterTaskDefinitionResponse.Builder = {
    value.fold(self) { v =>
      self.taskDefinition(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): RegisterTaskDefinitionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class RegisterTaskDefinitionResponseOps(val self: RegisterTaskDefinitionResponse) extends AnyVal {

  final def taskDefinitionAsScala: Option[TaskDefinition] = Option(self.taskDefinition)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterTaskDefinitionResponseOps {

  implicit def toRegisterTaskDefinitionResponseBuilderOps(
      v: RegisterTaskDefinitionResponse.Builder
  ): RegisterTaskDefinitionResponseBuilderOps = new RegisterTaskDefinitionResponseBuilderOps(v)

  implicit def toRegisterTaskDefinitionResponseOps(
      v: RegisterTaskDefinitionResponse
  ): RegisterTaskDefinitionResponseOps = new RegisterTaskDefinitionResponseOps(v)

}

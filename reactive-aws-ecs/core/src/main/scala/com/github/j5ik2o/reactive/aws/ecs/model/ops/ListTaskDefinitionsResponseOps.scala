// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListTaskDefinitionsResponseBuilderOps(val self: ListTaskDefinitionsResponse.Builder) extends AnyVal {

  final def taskDefinitionArnsAsScala(value: Option[Seq[String]]): ListTaskDefinitionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.taskDefinitionArns(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListTaskDefinitionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListTaskDefinitionsResponseOps(val self: ListTaskDefinitionsResponse) extends AnyVal {

  final def taskDefinitionArnsAsScala: Option[Seq[String]] = Option(self.taskDefinitionArns).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTaskDefinitionsResponseOps {

  implicit def toListTaskDefinitionsResponseBuilderOps(
      v: ListTaskDefinitionsResponse.Builder
  ): ListTaskDefinitionsResponseBuilderOps = new ListTaskDefinitionsResponseBuilderOps(v)

  implicit def toListTaskDefinitionsResponseOps(v: ListTaskDefinitionsResponse): ListTaskDefinitionsResponseOps =
    new ListTaskDefinitionsResponseOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListTasksResponseBuilderOps(val self: ListTasksResponse.Builder) extends AnyVal {

  final def taskArnsAsScala(value: Option[Seq[String]]): ListTasksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.taskArns(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListTasksResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListTasksResponseOps(val self: ListTasksResponse) extends AnyVal {

  final def taskArnsAsScala: Option[Seq[String]] = Option(self.taskArns).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTasksResponseOps {

  implicit def toListTasksResponseBuilderOps(v: ListTasksResponse.Builder): ListTasksResponseBuilderOps =
    new ListTasksResponseBuilderOps(v)

  implicit def toListTasksResponseOps(v: ListTasksResponse): ListTasksResponseOps = new ListTasksResponseOps(v)

}

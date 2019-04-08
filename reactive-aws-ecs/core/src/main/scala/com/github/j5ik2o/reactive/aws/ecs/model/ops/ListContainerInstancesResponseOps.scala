// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListContainerInstancesResponseBuilderOps(val self: ListContainerInstancesResponse.Builder) extends AnyVal {

  final def containerInstanceArnsAsScala(value: Option[Seq[String]]): ListContainerInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.containerInstanceArns(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListContainerInstancesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListContainerInstancesResponseOps(val self: ListContainerInstancesResponse) extends AnyVal {

  final def containerInstanceArnsAsScala: Option[Seq[String]] = Option(self.containerInstanceArns).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListContainerInstancesResponseOps {

  implicit def toListContainerInstancesResponseBuilderOps(
      v: ListContainerInstancesResponse.Builder
  ): ListContainerInstancesResponseBuilderOps = new ListContainerInstancesResponseBuilderOps(v)

  implicit def toListContainerInstancesResponseOps(
      v: ListContainerInstancesResponse
  ): ListContainerInstancesResponseOps = new ListContainerInstancesResponseOps(v)

}

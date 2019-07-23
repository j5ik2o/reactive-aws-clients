// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListContainerInstancesResponseBuilderOps(val self: ListContainerInstancesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceArnsAsScala(value: Option[Seq[String]]): ListContainerInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.containerInstanceArns(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListContainerInstancesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListContainerInstancesResponseOps(val self: ListContainerInstancesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceArnsAsScala: Option[Seq[String]] = Option(self.containerInstanceArns).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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

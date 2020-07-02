// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeTaskDefinitionResponseBuilderOps(val self: DescribeTaskDefinitionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala(value: Option[TaskDefinition]): DescribeTaskDefinitionResponse.Builder = {
    value.fold(self) { v => self.taskDefinition(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): DescribeTaskDefinitionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class DescribeTaskDefinitionResponseOps(val self: DescribeTaskDefinitionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala: Option[TaskDefinition] = Option(self.taskDefinition)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTaskDefinitionResponseOps {

  implicit def toDescribeTaskDefinitionResponseBuilderOps(
      v: DescribeTaskDefinitionResponse.Builder
  ): DescribeTaskDefinitionResponseBuilderOps = new DescribeTaskDefinitionResponseBuilderOps(v)

  implicit def toDescribeTaskDefinitionResponseOps(
      v: DescribeTaskDefinitionResponse
  ): DescribeTaskDefinitionResponseOps = new DescribeTaskDefinitionResponseOps(v)

}

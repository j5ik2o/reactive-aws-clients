// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListTaskDefinitionsResponseBuilderOps(val self: ListTaskDefinitionsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionArnsAsScala(value: Option[Seq[String]]): ListTaskDefinitionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.taskDefinitionArns(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListTaskDefinitionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListTaskDefinitionsResponseOps(val self: ListTaskDefinitionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionArnsAsScala: Option[Seq[String]] = Option(self.taskDefinitionArns).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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

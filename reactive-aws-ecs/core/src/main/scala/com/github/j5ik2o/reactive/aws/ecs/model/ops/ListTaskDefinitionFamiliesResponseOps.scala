// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListTaskDefinitionFamiliesResponseBuilderOps(val self: ListTaskDefinitionFamiliesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def familiesAsScala(value: Option[Seq[String]]): ListTaskDefinitionFamiliesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.families(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListTaskDefinitionFamiliesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListTaskDefinitionFamiliesResponseOps(val self: ListTaskDefinitionFamiliesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def familiesAsScala: Option[Seq[String]] = Option(self.families).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTaskDefinitionFamiliesResponseOps {

  implicit def toListTaskDefinitionFamiliesResponseBuilderOps(
      v: ListTaskDefinitionFamiliesResponse.Builder
  ): ListTaskDefinitionFamiliesResponseBuilderOps = new ListTaskDefinitionFamiliesResponseBuilderOps(v)

  implicit def toListTaskDefinitionFamiliesResponseOps(
      v: ListTaskDefinitionFamiliesResponse
  ): ListTaskDefinitionFamiliesResponseOps = new ListTaskDefinitionFamiliesResponseOps(v)

}

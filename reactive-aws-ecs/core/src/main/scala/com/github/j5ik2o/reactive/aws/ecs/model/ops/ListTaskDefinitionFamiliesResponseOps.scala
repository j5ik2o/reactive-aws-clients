// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListTaskDefinitionFamiliesResponseBuilderOps(val self: ListTaskDefinitionFamiliesResponse.Builder)
    extends AnyVal {

  final def familiesAsScala(value: Option[Seq[String]]): ListTaskDefinitionFamiliesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.families(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListTaskDefinitionFamiliesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListTaskDefinitionFamiliesResponseOps(val self: ListTaskDefinitionFamiliesResponse) extends AnyVal {

  final def familiesAsScala: Option[Seq[String]] = Option(self.families).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

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

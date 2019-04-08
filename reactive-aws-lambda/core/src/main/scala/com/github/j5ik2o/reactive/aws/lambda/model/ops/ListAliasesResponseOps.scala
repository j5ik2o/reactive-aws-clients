// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListAliasesResponseBuilderOps(val self: ListAliasesResponse.Builder) extends AnyVal {

  final def nextMarkerAsScala(value: Option[String]): ListAliasesResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  }

  final def aliasesAsScala(value: Option[Seq[AliasConfiguration]]): ListAliasesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.aliases(v.asJava)
    }
  }

}

final class ListAliasesResponseOps(val self: ListAliasesResponse) extends AnyVal {

  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  final def aliasesAsScala: Option[Seq[AliasConfiguration]] = Option(self.aliases).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListAliasesResponseOps {

  implicit def toListAliasesResponseBuilderOps(v: ListAliasesResponse.Builder): ListAliasesResponseBuilderOps =
    new ListAliasesResponseBuilderOps(v)

  implicit def toListAliasesResponseOps(v: ListAliasesResponse): ListAliasesResponseOps = new ListAliasesResponseOps(v)

}

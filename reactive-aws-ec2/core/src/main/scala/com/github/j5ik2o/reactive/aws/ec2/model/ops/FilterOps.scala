// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FilterBuilderOps(val self: Filter.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): Filter.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def valuesAsScala(value: Option[Seq[String]]): Filter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.values(v.asJava)
    }
  }

}

final class FilterOps(val self: Filter) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def valuesAsScala: Option[Seq[String]] = Option(self.values).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFilterOps {

  implicit def toFilterBuilderOps(v: Filter.Builder): FilterBuilderOps = new FilterBuilderOps(v)

  implicit def toFilterOps(v: Filter): FilterOps = new FilterOps(v)

}

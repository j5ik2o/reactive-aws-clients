// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class PlatformFilterBuilderOps(val self: PlatformFilter.Builder) extends AnyVal {

  final def typeAsScala(value: Option[String]): PlatformFilter.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def operatorAsScala(value: Option[String]): PlatformFilter.Builder = {
    value.fold(self) { v =>
      self.operator(v)
    }
  }

  final def valuesAsScala(value: Option[Seq[String]]): PlatformFilter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.values(v.asJava)
    }
  }

}

final class PlatformFilterOps(val self: PlatformFilter) extends AnyVal {

  final def typeAsScala: Option[String] = Option(self.`type`)

  final def operatorAsScala: Option[String] = Option(self.operator)

  final def valuesAsScala: Option[Seq[String]] = Option(self.values).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlatformFilterOps {

  implicit def toPlatformFilterBuilderOps(v: PlatformFilter.Builder): PlatformFilterBuilderOps =
    new PlatformFilterBuilderOps(v)

  implicit def toPlatformFilterOps(v: PlatformFilter): PlatformFilterOps = new PlatformFilterOps(v)

}

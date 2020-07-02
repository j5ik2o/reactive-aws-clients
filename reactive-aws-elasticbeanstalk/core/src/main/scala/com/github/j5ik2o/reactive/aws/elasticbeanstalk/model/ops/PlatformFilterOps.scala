// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class PlatformFilterBuilderOps(val self: PlatformFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[String]): PlatformFilter.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operatorAsScala(value: Option[String]): PlatformFilter.Builder = {
    value.fold(self) { v => self.operator(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valuesAsScala(value: Option[Seq[String]]): PlatformFilter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.values(v.asJava)
    }
  }

}

final class PlatformFilterOps(val self: PlatformFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[String] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operatorAsScala: Option[String] = Option(self.operator)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valuesAsScala: Option[Seq[String]] =
    Option(self.values).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlatformFilterOps {

  implicit def toPlatformFilterBuilderOps(v: PlatformFilter.Builder): PlatformFilterBuilderOps =
    new PlatformFilterBuilderOps(v)

  implicit def toPlatformFilterOps(v: PlatformFilter): PlatformFilterOps = new PlatformFilterOps(v)

}

// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CachingConfigBuilderOps(val self: CachingConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ttlAsScala(value: Option[Long]): CachingConfig.Builder = {
    value.fold(self) { v => self.ttl(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cachingKeysAsScala(value: Option[Seq[String]]): CachingConfig.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.cachingKeys(v.asJava)
    }
  }

}

final class CachingConfigOps(val self: CachingConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ttlAsScala: Option[Long] = Option(self.ttl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cachingKeysAsScala: Option[Seq[String]] =
    Option(self.cachingKeys).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCachingConfigOps {

  implicit def toCachingConfigBuilderOps(v: CachingConfig.Builder): CachingConfigBuilderOps =
    new CachingConfigBuilderOps(v)

  implicit def toCachingConfigOps(v: CachingConfig): CachingConfigOps = new CachingConfigOps(v)

}

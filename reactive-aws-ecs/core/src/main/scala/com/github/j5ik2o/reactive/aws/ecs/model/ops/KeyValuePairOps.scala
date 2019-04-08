// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class KeyValuePairBuilderOps(val self: KeyValuePair.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): KeyValuePair.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def valueAsScala(value: Option[String]): KeyValuePair.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class KeyValuePairOps(val self: KeyValuePair) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKeyValuePairOps {

  implicit def toKeyValuePairBuilderOps(v: KeyValuePair.Builder): KeyValuePairBuilderOps = new KeyValuePairBuilderOps(v)

  implicit def toKeyValuePairOps(v: KeyValuePair): KeyValuePairOps = new KeyValuePairOps(v)

}

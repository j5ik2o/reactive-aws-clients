// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class KeyValuePairBuilderOps(val self: KeyValuePair.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): KeyValuePair.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def valueAsScala(value: Option[String]): KeyValuePair.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  } // String

}

final class KeyValuePairOps(val self: KeyValuePair) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def valueAsScala: Option[String] = Option(self.value) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKeyValuePairOps {

  implicit def toKeyValuePairBuilderOps(v: KeyValuePair.Builder): KeyValuePairBuilderOps = new KeyValuePairBuilderOps(v)

  implicit def toKeyValuePairOps(v: KeyValuePair): KeyValuePairOps = new KeyValuePairOps(v)

}

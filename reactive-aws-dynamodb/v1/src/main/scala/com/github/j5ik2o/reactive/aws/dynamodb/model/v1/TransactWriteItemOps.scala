// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TransactWriteItem => ScalaTransactWriteItem, _ }
import com.amazonaws.services.dynamodbv2.model.{ TransactWriteItem => JavaTransactWriteItem }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TransactWriteItemOps {

  implicit class ScalaTransactWriteItemOps(val self: ScalaTransactWriteItem) extends AnyVal {

    def toJava: JavaTransactWriteItem = {
      val result = new JavaTransactWriteItem()
      self.conditionCheck.foreach { v =>
        import ConditionCheckOps._; result.withConditionCheck(v.toJava)
      } // ConditionCheck
      self.put.foreach { v =>
        import PutOps._; result.withPut(v.toJava)
      } // Put
      self.delete.foreach { v =>
        import DeleteOps._; result.withDelete(v.toJava)
      } // Delete
      self.update.foreach { v =>
        import UpdateOps._; result.withUpdate(v.toJava)
      } // Update

      result
    }

  }

  implicit class JavaTransactWriteItemOps(val self: JavaTransactWriteItem) extends AnyVal {

    def toScala: ScalaTransactWriteItem = {
      ScalaTransactWriteItem()
        .withConditionCheck(Option(self.getConditionCheck).map { v =>
          import ConditionCheckOps._; v.toScala
        }) // ConditionCheck
        .withPut(Option(self.getPut).map { v =>
          import PutOps._; v.toScala
        }) // Put
        .withDelete(Option(self.getDelete).map { v =>
          import DeleteOps._; v.toScala
        }) // Delete
        .withUpdate(Option(self.getUpdate).map { v =>
          import UpdateOps._; v.toScala
        }) // Update
    }

  }

}

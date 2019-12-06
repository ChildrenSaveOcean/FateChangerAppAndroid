package com.kidssaveocean.fatechanger.firebase.repository

import com.kidssaveocean.fatechanger.Constants
import com.kidssaveocean.fatechanger.firebase.model.ActionModel

object ActionsRepo: BaseFirebaseDBRepo<ActionModel, List<ActionModel>>(Constants.TABLE_NAME_ACTIONS, ActionModel::class.java) {

    override fun handleData(list: List<Pair<String, ActionModel>>): List<ActionModel> {
        return list.map {
            it.second
        }
    }
}